var totalPagar = 0;
var numRecord =1;
var productos = {};
function addRecord(){    
    var row = "";
    if(txtCodigo != "" && txtDescripcion != "" && txtCantidad !=0  && txtValor !=0)
        {
            totalPagar= totalPagar + ($("#txtCantidad").val()* $("#txtValor").val());
            var row= "<tr><td>" + numRecord + "</td><td>"+ $("#txtCodigo").val() +"</td><td>"+ $("#txtDescripcion").val() +"</td><td>"+
            $("#txtCantidad").val()+ "</td><td>"+$("#txtValor").val()+ "</td><td>"+ ($("#txtCantidad").val()* $("#txtValor").val()) + 
            "</td><td><input type = 'button' value='Edit' class='btn btn-warning btn-round'> " +
            "<input type='button' value= 'Delete' class='btn btn-danger btn-round' onclick='deleteRow(this)'> </td>" + "</tr>";
                var elemento = document.createElement("TR");
                elemento.innerHTML=row;                
                document.getElementById("TicketsProductsList").appendChild(elemento);
                document.getElementById("txtBuscar").value="";
                document.getElementById("txtCodigo").value = "";
                document.getElementById("txtDescripcion").value = "";
                document.getElementById("txtCantidad").value = "";
                document.getElementById("txtValor").value = "";
                document.getElementById("txtTotal").textContent = totalPagar;
                document.getElementById("valoraPagar").textContent = totalPagar;
                numRecord = numRecord + 1;
                document.getElementById("txtBuscar").focus;
        }
    }

    function calcularSaldo(){
        var valoraPagar=document.getElementById("valoraPagar").textContent;
        var valorEntregado =document.getElementById("valorEntregado").value;
        var saldo = valorEntregado - valoraPagar;
        if(saldo <= 0){
            document.getElementById("valorDevuelto").textContent=0;   
            document.getElementById("saldo").textContent=saldo * -1;        
        }
        else{
            document.getElementById("valorDevuelto").textContent=saldo;
            document.getElementById("saldo").textContent=0;                        
        }
    }
    
    function deleteRow(btn){
        var row = btn.parentNode.parentNode;
        row.parentNode.removeChild(row);
    }

    function selectRow(codigo, costo){
        document.getElementById("txtCodigo").value = codigo;
        document.getElementById("txtValor").value = costo;
        $("#btnCancelar").trigger('click');
    }

    function successExcecute(response){
        alert(response.codigo);
    }
    
    function errorExcecute(){
        alert("Error");
    }

    function listarProductos () {
        var url = "http://localhost:8080/Seller/resources/service/";
        var row = "";
        var parametros = [];
       /* $.ajax({
            url: url,
            method:"GET",
            contentType: "application/json",
            success:function (data) {successExcecute(data);},
            error:errorExcecute,
            dataType: "json"
        }); 
         */
        $.getJSON(url, function( data ){
            $.each(data, function(i, item){
                parametros[0]= item.codigo;
                parametros[1]= "'" + item.descripcion + "'";
                parametros[2]= item.costo;
                parametros[3]= "'" +item.categoria + "'";
                
               row = row + "<tr>" + 
                              "<td>" + item.codigo + "</td>"+
                              "<td>" + item.descripcion + "</td>" + 
                              "<td>" + item.costo + "</td>" + 
                              "<td>" + item.categoria + "</td>" +
                              "<td><input type='button' value= 'Seleccionar' class='btn btn-primary btn-round' \n\
                            onclick= 'selectRow(" + item.codigo + "," + item.costo +  ");'</td></tr>"
            })
            $("#listProducts").html(row);
        }).done(function() {
            //console.log( "second success" );
          })
          .fail(function() {
            console.log( "error" );
          })
          .always(function() {
            //console.log( "complete" );
          });
    }
/*
    function listarProductos () {
        var url = "127.0.0.1:8080/Ventas/resources/service";
        fetch(url).then((respuesta)=>{
            return respuesta.json();
        }).then((respuesta)=> {
console.log(respuesta);
        })
         
    }*/
