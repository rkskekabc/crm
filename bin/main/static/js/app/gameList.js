var gameList = {
	init : function(){
		var _this = this;
		$('#navListItem').addClass('active');
		
        $('#btn-save').on('click', function () {
            _this.save();
        });
	},
	
    save : function () {
        var data = {
            name: $('#name').val(),
            genre: $('#genre').val(),
            price: $('#price').val(),
            release_date: $('#release_date').val(),
            description: $('#description').val()
        };

        $.ajax({
            type: 'POST',
            url: '/games',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('게임이 등록되었습니다.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }
};

gameList.init();