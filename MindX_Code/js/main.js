AOS.init({
	duration: 800,
	easing: 'slide',
	once: true
});

jQuery(document).ready(function ($) {

	"use strict";



	var siteMenuClone = function () {

		$('.js-clone-nav').each(function () {
			var $this = $(this);
			$this.clone().attr('class', 'site-nav-wrap').appendTo('.site-mobile-menu-body');
		});


		setTimeout(function () {

			var counter = 0;
			$('.site-mobile-menu .has-children').each(function () {
				var $this = $(this);

				$this.prepend('<span class="arrow-collapse collapsed">');

				$this.find('.arrow-collapse').attr({
					'data-toggle': 'collapse',
					'data-target': '#collapseItem' + counter,
				});

				$this.find('> ul').attr({
					'class': 'collapse',
					'id': 'collapseItem' + counter,
				});

				counter++;

			});

		}, 1000);

		$('body').on('click', '.arrow-collapse', function (e) {
			var $this = $(this);
			if ($this.closest('li').find('.collapse').hasClass('show')) {
				$this.removeClass('active');
			} else {
				$this.addClass('active');
			}
			e.preventDefault();

		});

		$(window).resize(function () {
			var $this = $(this),
				w = $this.width();

			if (w > 768) {
				if ($('body').hasClass('offcanvas-menu')) {
					$('body').removeClass('offcanvas-menu');
				}
			}
		})

		$('body').on('click', '.js-menu-toggle', function (e) {
			var $this = $(this);
			e.preventDefault();

			if ($('body').hasClass('offcanvas-menu')) {
				$('body').removeClass('offcanvas-menu');
				$this.removeClass('active');
			} else {
				$('body').addClass('offcanvas-menu');
				$this.addClass('active');
			}
		})

		// click outisde offcanvas
		$(document).mouseup(function (e) {
			var container = $(".site-mobile-menu");
			if (!container.is(e.target) && container.has(e.target).length === 0) {
				if ($('body').hasClass('offcanvas-menu')) {
					$('body').removeClass('offcanvas-menu');
				}
			}
		});
	};
	siteMenuClone();


	var sitePlusMinus = function () {
		$('.js-btn-minus').on('click', function (e) {
			e.preventDefault();
			if ($(this).closest('.input-group').find('.form-control').val() != 0) {
				$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) - 1);
			} else {
				$(this).closest('.input-group').find('.form-control').val(parseInt(0));
			}
		});
		$('.js-btn-plus').on('click', function (e) {
			e.preventDefault();
			$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) + 1);
		});
	};
	// sitePlusMinus();


	var siteSliderRange = function () {
		$("#slider-range").slider({
			range: true,
			min: 0,
			max: 500,
			values: [75, 300],
			slide: function (event, ui) {
				$("#amount").val("$" + ui.values[0] + " - $" + ui.values[1]);
			}
		});
		$("#amount").val("$" + $("#slider-range").slider("values", 0) +
			" - $" + $("#slider-range").slider("values", 1));
	};
	// siteSliderRange();



	var siteCarousel = function () {
		if ($('.nonloop-block-13').length > 0) {
			$('.nonloop-block-13').owlCarousel({
				center: false,
				items: 1,
				loop: true,
				stagePadding: 0,
				margin: 0,
				autoplay: true,
				nav: true,
				navText: ['<span class="icon-arrow_back">', '<span class="icon-arrow_forward">'],
				responsive: {
					600: {
						margin: 0,
						nav: true,
						items: 2
					},
					1000: {
						margin: 0,
						stagePadding: 0,
						nav: true,
						items: 3
					},
					1200: {
						margin: 0,
						stagePadding: 0,
						nav: true,
						items: 4
					}
				}
			});
		}

		$('.slide-one-item').owlCarousel({
			center: false,
			items: 1,
			loop: true,
			stagePadding: 0,
			margin: 0,
			autoplay: true,
			pauseOnHover: false,
			nav: true,
			navText: ['<span class="icon-keyboard_arrow_left">', '<span class="icon-keyboard_arrow_right">']
		});
	};
	siteCarousel();

	var siteStellar = function () {
		$(window).stellar({
			responsive: false,
			parallaxBackgrounds: true,
			parallaxElements: true,
			horizontalScrolling: false,
			hideDistantElements: false,
			scrollProperty: 'scroll'
		});
	};
	siteStellar();

	var siteCountDown = function (x) {


		$('#date-countdown').countdown(x, function (event) {
			var $this = $(this).html(event.strftime(''
				+ '<span class="countdown-block"><span class="label">%w</span> weeks </span>'
				+ '<span class="countdown-block"><span class="label">%d</span> days </span>'
				+ '<span class="countdown-block"><span class="label">%H</span> hr </span>'
				+ '<span class="countdown-block"><span class="label">%M</span> min </span>'
				+ '<span class="countdown-block"><span class="label">%S</span> sec</span>'));
		});

	};

	let dateRun = '2020/8/10';
	siteCountDown(dateRun);

	var siteDatePicker = function () {

		if ($('.datepicker').length > 0) {
			$('.datepicker').datepicker();
		}

	};
	siteDatePicker();

	var siteSticky = function () {
		$(".js-sticky-header").sticky({ topSpacing: 0 });
	};
	siteSticky();

	// navigation
	var OnePageNavigation = function () {
		var navToggler = $('.site-menu-toggle');
		$("body").on("click", ".main-menu li a[href^='#'], .smoothscroll[href^='#'], .site-mobile-menu .site-nav-wrap li a", function (e) {
			e.preventDefault();

			var hash = this.hash;

			$('html, body').animate({
				'scrollTop': $(hash).offset().top
			}, 600, 'easeInOutCirc', function () {
				window.location.hash = hash;
			});

		});
	};
	OnePageNavigation();

	var siteScroll = function () {



		$(window).scroll(function () {

			var st = $(this).scrollTop();

			if (st > 100) {
				$('.js-sticky-header').addClass('shrink');
			} else {
				$('.js-sticky-header').removeClass('shrink');
			}

		})

	};
	siteScroll();

});
// Modal
var modal = document.getElementById("myModal");
var btn = document.getElementById("cart");
var close = document.getElementsByClassName("close")[0];
// t???i sao l???i c?? [0] nh??  th??? n??y b???i v?? m???i close l?? m???t html colection n??n khi m??nh mu???n l???y gi?? tr??? html th?? ph???i th??m [0]. 
// N???u m??nh c?? 2 c??i component c??ng class th?? khi [0] n?? s??? hi???n th??? component 1 c??n [1] th?? n?? s??? hi???n th??? component 2.
var close_footer = document.getElementsByClassName("close-footer")[0];
var order = document.getElementsByClassName("order")[0];
btn.onclick = function () {
	modal.style.display = "block";
	$(document).ready(function () {
		$('.modal-info input[type="text"]').blur(function () { // blur thoat khoai focus input
			if (!$(this).val()) {
				$(this).addClass("error");
			} else {
				$(this).removeClass("error");
			}
		});
		$('.modal-info input[type="email"]').blur(function () { // blur thoat khoai focus input
			if (!$(this).val()) {
				$(this).addClass("error");
			} else {
				$(this).removeClass("error");
			}
		});
		$('.modal-info input[type="date"]').blur(function () { // blur thoat khoai focus input
			if (!$(this).val()) {
				$(this).addClass("error");
			} else {
				$(this).removeClass("error");
			}
		});
	});
}
close.onclick = function () {
	modal.style.display = "none";
}
close_footer.onclick = function () {
	modal.style.display = "none";
}
order.onclick = function () {
	let error = ''
	if ($('#firstName').val().trim() === '') {
		error += "Name can't be empty\n"
	}
	if ($('#lastName').val().trim() === '') {
		error += "lastName can't be empty\n"
	}
	if ($('#Email').val().trim() === '') {
		error += "Email can't be empty\n"
	}
	if ($('#Date').val().trim() === '') {
		error += "Date can't be empty\n"
	}
	if (error === '') {
		$('.modal').hide(); // t???t modal
		Swal.fire({
			icon: 'success',
			title: `Thank you ${$('#firstName').val()} `,
			showConfirmButton: false,
			timer: 5500
		}).then(() => {
			location.reload()
		});
		// then su dung la sau khi thanh cong thi se lam gi
	}else{
		Swal.fire({
			icon: 'error',
			title: 'Oops...',
			text: 'Something went wrong!',
			footer: '<a href>Why do I have this issue?</a>'
		  })
	}
}

window.onclick = function (event) {
	if (event.target == modal) {
		modal.style.display = "none";
	}
}
// update cart 
function updatecart() {
	var cart_item = document.getElementsByClassName("cart-items")[0];
	var cart_rows = cart_item.getElementsByClassName("cart-row");
	var total = 0;
	for (var i = 0; i < cart_rows.length; i++) {
		var cart_row = cart_rows[i]
		var price_item = cart_row.getElementsByClassName("cart-price ")[0]
		var quantity_item = cart_row.getElementsByClassName("cart-quantity-input")[0]
		var price = parseFloat(price_item.innerText.replace(/[\.??]/g, ""))// chuy???n m???t chu???i string sang number ????? t??nh t???ng ti???n.
		var quantity = quantity_item.value // l???y gi?? tr??? trong th??? input
		total = total + (price * quantity)
	}
	document.getElementsByClassName("cart-total-price")[0].innerText = total + 'VN??'
	// Thay ?????i text = total trong .cart-total-price. Ch??? c?? m???t .cart-total-price n??n m??nh s??? d???ng [0].
}
// // x??a cart
var remove_cart = document.getElementsByClassName("btn-danger");
for (var i = 0; i < remove_cart.length; i++) {
	var button = remove_cart[i]
	button.addEventListener("click", function () {
		var button_remove = event.target
		button_remove.parentElement.parentElement.remove();
		updatecart();
	})

}

// thay ?????i s??? l?????ng s???n ph???m
var quantity_input = document.getElementsByClassName("cart-quantity-input");
for (var i = 0; i < quantity_input.length; i++) {
	var input = quantity_input[i];
	input.addEventListener("change", function (event) {
		var input = event.target
		if (isNaN(input.value) || input.value <= 0) {
			input.value = 1;
		}
		updatecart();
	})
}
// Th??m v??o gi???
var add_cart = document.getElementsByClassName(" mr-1 ")
for (var i = 0; i < add_cart.length; i++) {
	var add = add_cart[i];
	add.addEventListener("click", function (event) {

		var button = event.target;
		var product = button.parentElement.parentElement;
		var img = product.parentElement.getElementsByClassName("img-fluid")[0].src
		var title = product.getElementsByClassName("content-product-h3")[0].innerText
		var price = product.getElementsByClassName("price")[0].innerText
		addItemToCart(title, price, img)
		// Khi th??m s???n ph???m v??o gi??? h??ng th?? s??? hi???n th??? modal
		modal.style.display = "block";

		updatecart()
	})
}

function addItemToCart(title, price, img) {
	var cartRow = document.createElement('div')
	cartRow.classList.add('cart-row')
	var cartItems = document.getElementsByClassName('cart-items')[0]
	var cart_title = cartItems.getElementsByClassName('cart-item-title')
	// N???u title c???a s???n ph???m b???ng v???i title m?? b???n th??m vao gi??? h??ng th?? s??? th??ng cho user.
	for (var i = 0; i < cart_title.length; i++) {
		if (cart_title[i].innerText == title) {
			alert('S???n Ph???m ???? C?? Trong Gi??? H??ng')
			return
		}
	}

	var cartRowContents = `
  <div class="cart-item cart-column">
      <img class="cart-item-image" src="${img}" width="100" height="100">
      <span class="cart-item-title">${title}</span>
  </div>
  <span class="cart-price cart-column">${price}</span>
  <div class="cart-quantity cart-column">
      <input class="cart-quantity-input" type="number" value="1">
      <button class="btn btn-danger" type="button">X??a</button>
  </div>`
	cartRow.innerHTML = cartRowContents
	cartItems.append(cartRow)
	cartRow.getElementsByClassName('btn-danger')[0].addEventListener('click', function () {
		var button_remove = event.target
		button_remove.parentElement.parentElement.remove()
		updatecart()
	})
	cartRow.getElementsByClassName('cart-quantity-input')[0].addEventListener('change', function (event) {
		var input = event.target
		if (isNaN(input.value) || input.value <= 0) {
			input.value = 1;
		}
		updatecart()
	})
}


// var btn_menu = document.getElementById("btnmenu");
// btn_menu.addEventListener("click", function () {
//   var item_menu = document.getElementById("menutop");
//   if (item_menu.style.display === "block") {
//     item_menu.style.display = "none";
//   } else {
//     item_menu.style.display = "block";
//   }
// })

