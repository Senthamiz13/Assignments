INSERT INTO users(username, password, enabled, count)
values('user','$2a$10$vVyFjZ41RxExbWPJDto60uX60RUCJWsMnwtLHDKo2SaNCZc76101u',true, 3);

INSERT INTO users(username, password, enabled, count)
values('admin','$2a$10$vVyFjZ41RxExbWPJDto60uX60RUCJWsMnwtLHDKo2SaNCZc76101u',true,3);

INSERT INTO authorities (username, authority)
values ('user','ROLE_USER');

INSERT INTO authorities (username, authority)
values ('admin','ROLE_ADMIN');
