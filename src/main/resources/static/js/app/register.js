var register = {
	init : function(){
		var _this = this;
		$('#navHomeItem').addClass('active');
		
        $('#btn-save').on('click', function () {
            _this.save();
        });
	},
	
    save : function () {
        var data = {
        	user_id: $('#user_id').val(),
        	password: $('#password').val(),
        	name: $('#name').val(),
        	birthday: $('#birthday').val(),
        	email: $('#email').val(),
        	phone: $('#phone').val(),
        	role_name: 'BASIC'
        };
        
        $.ajax({
        	beforeSend: function(request) {
	            request.setRequestHeader($('#_csrf').attr('name'), $('#_csrf').attr('value'));
	        },
            type: 'POST',
            url: '/register',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('가입이 완료되었습니다.');
        }).fail(function (error) {
            console.log(error);
        });
    }
};

register.init();