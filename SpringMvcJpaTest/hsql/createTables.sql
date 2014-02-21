DROP TABLE MENU IF EXISTS CASCADE;
DROP TABLE PIZZA IF EXISTS CASCADE;
DROP TABLE DRINK IF EXISTS CASCADE;

CREATE TABLE PIZZA 
(	
	PIZZA_ID INTEGER primary key,
	PIZZA_NAME VARCHAR(50) NOT NULL,
	PIZZA_PRICE INTEGER NOT NULL,
	PIZZA_DOUGH VARCHAR(100),
	PIZZA_SAUCE VARCHAR(100),
	RECIPE VARCHAR(4000)
);


CREATE TABLE DRINK
(
	DRINK_ID INTEGER NOT NULL primary key,
	DRINK_NAME VARCHAR(50) NOT NULL,
	DRINK_PRICE INTEGER NOT NULL
);


CREATE TABLE MENU
(
	MENU_ID INTEGER NOT NULL primary key,
	MENU_NAME VARCHAR(50) NOT NULL,
	MENU_PRICE INTEGER NOT NULL,
	PIZZA_ID INTEGER,
	DRINK_ID INTEGER,
	FOREIGN KEY(PIZZA_ID) REFERENCES PIZZA(PIZZA_ID),
	FOREIGN KEY(DRINK_ID) REFERENCES DRINK(DRINK_ID)
);
