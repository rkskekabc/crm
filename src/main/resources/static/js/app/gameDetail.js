var gameDetail = {
	init : function(){
		var _this = this;
		$('#navListItem').addClass('active');
		
		$('#btn-buy').on('click', function () {
            _this.save();
        });
	},

	save : function(){
		var data = {
            game_id: $("#game_id").val(),
            sell_date: new Date(),
            sell_price: $("#sell_price").val()
        };

		var buyConfirm = confirm("구매하시겠습니까?");
		if(buyConfirm)
        $.ajax({
            type: 'POST',
            url: '/revenues',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('구매하였습니다.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
	}
}

gameDetail.init();