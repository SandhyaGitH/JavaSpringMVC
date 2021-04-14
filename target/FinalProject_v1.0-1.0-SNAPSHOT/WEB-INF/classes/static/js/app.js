/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $.ajax({
        url:'ServeletName',
        cache:false,
        dataType:'json',
        success:function(result){
            $.each(result,function(key,value)
            {
                    $('<option>').val(key).text(value).appendTo("#country");
            });
        }
    });
});


