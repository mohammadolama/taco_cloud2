create table if not exists Taco_Order
(
    id
    SERIAL
    PRIMARY
    KEY,
    customer_Name
    varchar
(
    50
) NOT NULL,
    delivery_Street varchar
(
    50
) NOT NULL,
    delivery_City varchar
(
    50
) NOT NULL,
    delivery_State varchar
(
    2
) NOT NULL,
    delivery_Zip varchar
(
    10
) NOT NULL,
    cc_number varchar
(
    16
) NOT NULL,
    cc_expiration varchar
(
    5
) NOT NULL,
    cc_cvv varchar
(
    3
) NOT NULL,
    placed_at timestamp NOT NULL
    );

create table if not exists Taco
(
    id
    SERIAL
    PRIMARY
    KEY,
    name
    varchar
(
    50
) not null,
    taco_order bigint not null,
    taco_order_key bigint not null,
    created_at timestamp not null
    );

create table if not exists Ingredient_Ref
(
    ingredient varchar
(
    4
) not null,
    taco bigint not null,
    taco_key bigint not null
    );
CREATE TABLE if NOT EXISTS Ingredient
(
    id varchar
(
    4
) PRIMARY KEY NOT NULL,
    name varchar
(
    25
) NOT NULL,
    type varchar
(
    10
) NOT NULL
    );
alter table Taco
    add foreign key (taco_order) references Taco_Order (id);
alter table Ingredient_Ref
    add foreign key (ingredient) references Ingredient (id);