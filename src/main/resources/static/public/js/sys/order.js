$(function(){
    var option = {
        url: '../sys/order/list',
        pagination: true,	//显示分页条
        sidePagination: 'server',//服务器端分页
        showRefresh: true,  //显示刷新按钮
        toolbar: '#toolbar',
        striped : true,     //设置为true会有隔行变色效果
        //idField: 'menuId',
        columns: [
            {
                field: 'orderId',
                title: '序号',
                width: 40,
                formatter: function(value, row, index) {
                    var pageSize = $('#table').bootstrapTable('getOptions').pageSize;
                    var pageNumber = $('#table').bootstrapTable('getOptions').pageNumber;
                    return pageSize * (pageNumber - 1) + index + 1;
                }
            },
            {checkbox:true},
            { title: '订单号', field: 'orderNum',sortable:true},
            {title:'买家ID', field:'orderId'},
            { title: '收货人ID', field: 'conId'},
            { title: '交易状态', field: 'status', formatter: function(value){
                    if(value === 0){
                        return '<span class="label label-primary">进行中</span>';
                    }
                    if(value === 1){
                        return '<span class="label label-success">已完成</span>';
                    }
                    if(value === 2){
                        return '<span class="label label-warning">取消交易</span>';
                    }
                    if(value === 3){
                        return '<span class="label label-info">已结算</span>';
                    }
                }},
            { title: '支付状态', field: 'payStatus', formatter: function(value){
                    if(value === 4){
                        return '<span class="label label-primary">线下付款已收款</span>';
                    }
                    if(value === 1){
                        return '<span class="label label-danger">未付款</span>';
                    }
                    if(value === 2){
                        return '<span class="label label-success">已付款</span>';
                    }
                    if(value === 3){
                        return '<span class="label label-info">线下付款</span>';
                    }
                }},
            { title: '订单金额', field: 'amount'},
            { title: '交易订单号', field: 'tradeNum'},
            { title: '订单创建时间', field: 'createDate'},
            { title: '订单附言', field: 'remark'}
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
            location.href="http://127.0.0.1:8081/exportExcel1";
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
        }
    }
});