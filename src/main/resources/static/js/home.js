(() => {
    function formatProduct(product) {
        if (product.discountedPrice == null) {
            return '<div class="product col-md-2 mt-2 bg-product rounded ml-4 mr-4 mb-5">'
                + '<div class="text-center mt-3">'
                + `<a href="/products/details/${product.id}"><img src="${product.imageUrl}" 
class="product-image-home img-thumbnail px-auto" alt="Image not loaded..."/></a>`
                + '</div>'
                + `<h5 class="text-center font-weight-bold mt-3">Название: ${product.name}</h5>`
                + `<h5 class="text-center font-weight-bold" style="color: black">Цена: $${product.price.toFixed(2)}</h5>`
                + '</div>'
        } else {
            return '<div class="product col-md-2 mt-2 bg-product rounded ml-4 mr-4 mb-5">'
                + '<div class="text-center mt-3">'
                + `<a href="/products/details/${product.id}"><img src="${product.imageUrl}" 
class="product-image-home img-thumbnail px-auto" alt="Image not loaded..."/></a>`
                + '</div>'
                + `<h5 class="text-center font-weight-bold mt-3">Название: ${product.name}</h5>`
                + `<h5 class="text-center font-weight-bold" style="color: black">Цена: $${product.price.toFixed(2).strike()}</h5>`
                + `<h5 class="text-center font-weight-bold" style="color: orangered">Новая цена: $${product.discountedPrice.toFixed(2)}</h5>`
                + '</div>'
        }
    }

    fetch('/products/fetch')
        .then((response) => response.json())
        .then((json) => {
            $('.products-data').empty();
            if (json.length === 0) {
                $('.products-data').append(`<h1 class="text-center font-weight-bold">Нет товаров в категории ${category}.</h1>`)
            } else {
                for (let i = 0; i < json.length; i++) {
                    $('.products-data').append(formatProduct(json[i]));
                }
            }
        })
        .catch((err) => console.log(err));
})();