create database bit;
use bit;
CREATE TABLE orders (
    id VARCHAR(36) NOT NULL PRIMARY KEY,   -- corresponds to String id (UUID or custom string)
    user_id VARCHAR(255) NOT NULL,         -- corresponds to String userId
    product_id INT NOT NULL,               -- corresponds to Integer productId
    address_id INT NOT NULL                -- corresponds to Integer addressId
);
