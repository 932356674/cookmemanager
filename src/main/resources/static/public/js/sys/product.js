$(function(){
    var option = {
        url: '../sys/product/list',
        pagination: true,	//显示分页条
        sidePagination: 'server',//服务器端分页
        showRefresh: true,  //显示刷新按钮
        search: true,
        toolbar: '#toolbar',
        striped : true,     //设置为true会有隔行变色效果
        //idField: 'menuId',
        columns: [
            {
                field: 'productId',
                title: '序号',
                width: 40,
                formatter: function(value, row, index) {
                    var pageSize = $('#table').bootstrapTable('getOptions').pageSize;
                    var pageNumber = $('#table').bootstrapTable('getOptions').pageNumber;
                    return pageSize * (pageNumber - 1) + index + 1;
                }
            },
            {checkbox:true},
            { title: '商品编号', field: 'productId'},
            { title: '商品名称', field: 'productName'},
            { title: '商品别名', field: 'alias'},
            { title: '图片',field:'productImages',width:'15%',
                formatter:function (value, row, index) {
                    return "<img style='width:50px;height:50px;' src='http://39.106.68.255:80/"+value+"' alt=''>"
                }},
            { title: '商品价格', field: 'price'},
            { title: '计量单位', field: 'unit'},
            { title: '商品种类', field: 'sort'},
            { title: '商品描述', field: 'productMassage'},
            { title: '商品优点', field: 'merit'},
            { title: '适宜人群', field: 'recommend'},
            { title: '禁忌人群', field: 'taboo'},
            { title: '销量', field: 'sales'}
        ]};
    $('#table').bootstrapTable(option);
});
var ztree;

var vm = new Vue({
	el:'#dtapp',
    data:{
        showList: true,
        title: null,
        product:{}
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
            var id = 'productId';
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
                    url: "product/del",
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
            vm.product = {parentName:null,parentId:0,type:1,orderNum:0};
            vm.getProduct();
        },
        update: function (event) {
            var id = 'productId';
            var productId = getSelectedRow()[id];
            if(productId == null){
                return ;
            }

            $.get("../sys/product/info/"+productId, function(r){
                vm.showList = false;
                vm.title = "修改";
                vm.product = r.product;

                vm.getProduct();
            });
        },
        saveOrUpdate: function (event) {
            var url = vm.product.productId == null ? "../sys/product/save" : "../sys/product/update";
            $.ajax({
                type: "POST",
                url: url,
                data: JSON.stringify(vm.product),
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