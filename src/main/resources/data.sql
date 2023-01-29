INSERT INTO CATEGORY (CATEGORY_NAME) VALUES
  ('Fashion'),
  ('Electronics'),
  ('Books'),
  ('Groceries'),
  ('Medicines');
  
INSERT INTO ROLE (role) VALUES
  ('CONSUMER'),
  ('SELLER');
  
INSERT INTO USER (username, password) VALUES
  ('jack','pass_word'),
  ('bob','pass_word'),
  ('apple','pass_word'),
  ('glaxo','pass_word');

INSERT INTO CART (TOTAL_AMOUNT ,USER_ID) VALUES
  (20,1),
  (0,2);

INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES
  (1,1),
  (2,1),
  (3,2),
  (4,2);

INSERT INTO PRODUCT (price, PRODUCT_NAME, CATEGORY_ID, USER_ID) VALUES
  (29190, 'Apple iPad 10.2 8th Gen WiFi iOS Tablet', 2, 3),
  (10, 'Crocin pain relief tablet', 5, 4);

INSERT INTO CART_PRODUCT (CART_ID, PRODUCT_ID, quantity) VALUES
  (1, 2, 2);





