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

$(document).on('click', '.updateProduct', function(){
    var idProduct = $(this).attr("data-id");
    console.log("ID PRODUCT : "+idProduct);

});


$(document).on('click', '.deleteProduct', function(){
    var idProduct = $(this).attr("data-id");
    console.log('ID PRODUCT : '+idProduct);
});