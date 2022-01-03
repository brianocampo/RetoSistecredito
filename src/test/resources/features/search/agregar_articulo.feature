Feature: Agregar productos al carrito de compras

  Scenario: Comprar un producto
    Given un usuario busca un producto de su interes
    When selecciona el producto y lo agrega al carrito de compras
      | tipoProducto |
      | ropa         |
    Then el producto queda pendiente por confirmacion de pago