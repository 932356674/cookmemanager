$(function(){
    var option = {
        url: '../sys/user/list',
        pagination: true,	//显示分页条
        sidePagination: 'server',//服务器端分页
        showRefresh: true,  //显示刷新按钮
        search: true,
        toolbar: '#toolbar',
        striped : true,     //设置为true会有隔行变色效果
        //idField: 'menuId',
        columns: [
            {
                field: 'usId',
                title: '序号',
                width: 40,
                formatter: function(value, row, index) {
                    var pageSize = $('#table').bootstrapTable('getOptions').pageSize;
                    var pageNumber = $('#table').bootstrapTable('getOptions').pageNumber;
                    return pageSize * (pageNumber - 1) + index + 1;
                }
            },
            {checkbox:true},
            { title: '用户ID', field: 'usId',sortable:true},
            {title:'用户名', field:'usName'},
            { title: '密码', field: 'usPassword',formatter:function(value){
                return '******';
                }},
            { title: '邮箱', field: 'usEmail'},
            { title: '手机号', field: 'usMobile'},
            { title: '性别', field: 'usSex'},
            { title: '生日', field: 'usBirthday'},
            { title: '现居住地', field: 'usNowhome'},
            { title: '工作', field: 'usJob'},
            { title: '头像', field: 'usHead'},
            { title: '粉丝数', field: 'usFanscount'},
            { title: '菜谱数', field: 'usBookcount'},
            { title: '创建时间', field: 'usCreatedate'}
        ]};
    $('#table').bootstrapTable(option);
});
var ztree;

var vm = new Vue({
	el:'#dtapp',
    data:{
        showList: true,
        title: null,
        user:{}
    },
    methods:{
	    exportExcel:function(){
	        console.log("导出！")
            location.href="http://127.0.0.1:8081/exportExcel";
        },
        del: function(){
            var rows = getSelectedRows();
            if(rows == null){
                return ;
            }
            var id = 'usId';
            //提示确认框
            layer.confirm('您确定要删除所选数据吗？', {
                btn: ['确定', '取消'] //可以无限个按钮
            }, function(index, layero){
                var ids = new Array();
                //遍历所有选择的行数据，取每条数据对应的ID
                $.each(rows, function(i, row) {
                    ids[i] = row[id];
                });

                $.ajax({
                    type: "POST",
                    url: "user/del",
                    data: JSON.stringify(ids),
                    success : function(r) {
                        if(r.code === 0){
                            layer.alert('删除成功');
                            $('#table').bootstrapTable('refresh');
                        }else{
                            layer.alert(r.msg);
                        }
                    },
                    error : function() {
                        layer.alert('服务器没有返回数据，可能服务器忙，请重试');
                    }
                });
            });
        },
        add: function(){
            vm.showList = false;
            vm.title = "新增";
            vm.user = {parentName:null,parentId:0,type:1,orderNum:0};
            vm.getUser();
        },
        update: function (event) {
            var id = 'usId';
            var usId = getSelectedRow()[id];
            if(usId == null){
                return ;
            }

            $.get("../sys/user/info/"+usId, function(r){
                vm.showList = false;
                vm.title = "修改";
                vm.user = r.user;

                vm.getUser();
            });
        },
        saveOrUpdate: function (event) {
            var url = vm.user.usId == null ? "../sys/user/save" : "../sys/user/update";
            $.ajax({
                type: "POST",
                url: url,
                data: JSON.stringify(vm.user),
                success: function(r){
                    if(r.code === 0){
                        layer.alert('操作成功', function(index){
                            layer.close(index);
                            vm.reload();
                        });
                    }else{
                        layer.alert(r.msg);
                    }
                }
            });
        },
        reload: function (event) {
            vm.showList = true;
            $("#table").bootstrapTable('refresh');
        },

    }
});