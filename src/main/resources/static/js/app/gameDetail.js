var gameDetail = {
	init : function(){
		var _this = this;
		$('#navListItem').addClass('active');
		
		$('#btn-buy').on('click', function () {
            _this.buy();
        });
	},

	buy : function () {
		console.log("gameid : " + $('#gameId').val());
	    var data = {
	        gameId: $('#gameId').val()
	    };
	    
	    var buyConfirm = confirm("구매하시겠습니까?");
	    
	    if(buyConfirm){
		    $.ajax({
		        type: 'POST',
		        url: '/buyGame',
		        dataType: 'json',
		        contentType:'application/json; charset=utf-8',
		        data: JSON.stringify(data)
		    }).done(function() {
		        alert('구매하였습니다.');
		        location.reload();
		    }).fail(function (error) {
		    	console.log(error);
		    });
	    }
	}
}

gameDetail.init();