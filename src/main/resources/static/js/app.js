function openFormNewProduct(){

    var productId = $("#productId").val("");

    if(productId = null){
        $(".update").hide();
        $(".save").show();
    }else{
        $(".save").hide();
        $(".update").show();
    }

     $("#mymodal").modal('show');
     $("#formproduct")[0].reset();
}

$(document).ready(function(){
    var tabelprod = $("#tabel-product");
    if(tabelprod.length){

        tabelprod.DataTable({
            lengthMenu : [[5, 10, -1],['Tampilkan 5', 'Tampilkan 10', 'Lihat Semua']],
            pageLength : 1,
            ajax: {
                url:'http://localhost:8080/api/product',
                dataSrc:''
            },
            columns:[
                {data:'id'},
                {data:'name'},
                {data:'price'},
                {data:'stock'},
                {data:'id',
                mRender:function(data,type,row){
                    var html = ""
                    html += "<button class='btn btn-primary updateProduct' data-id='"+data+"' >Update</button>";
                    html += "<button class='btn btn-danger deleteProduct' data-id='"+data+"' >Delete</button>";
                    return html;
                }
              }
            ]
        });
    }
});

$(document).on('click', '.editProduct', function(){

    var productId = $(this).attr("id");

    $.ajax({
        url: 'http://localhost:8080/api/product/'+productId,
        method: 'PUT',
        success: function(response) {
            //list data product
        }
    })
});

$(document).on('click', '.updateProduct', function(){
    var idProduct = $(this).attr("data-id");
    var productId = $("#productId").val("");
    console.log("ID PRODUCT : "+idProduct);
    $.ajax({
        url:'http://localhost:8080/api/product/by/'+idProduct,
        method:'GET',
        success:function(response){

            if(productId != null){
                $(".save").hide();
            }else{
                $(".update").show();
            }

            $("#productId").val(idProduct);
            $("#name").val(response.name);
            $("#stock").val(response.stock);
            $("#price").val(response.price);
            $("#discount option[value='"+response.discount+"']").prop("selected", true);
            $("#status option[value='"+response.status+"']").prop("selected", true);
            $("#mymodal").modal('show');

            console.log("idproduct: "+idProduct);
            console.log("name: "+response.name);
            console.log("stock: "+response.stock);
            console.log("price: "+response.price);
            console.log("discount: "+response.discount);
            console.log("status: "+response.status);
        }
    });
});




$(document).on('click', '.deleteProduct', function(){
    var idProduct = $(this).attr("data-id");
    console.log('ID PRODUCT : '+idProduct);
});