CREATE TABLE cars (
                          car_id integer,
                          car_name varchar(30),
                          car_brand varchar (30)
                          car_price int
                  );

CREATE TABLE clients (
                         client_id int ,
                         client_name varchar(50)
                     );

CREATE TABLE orders (
                           orders_id int PRIMARY KEY,
                           client_id int,
                           car_id int,
);