INSERT INTO users(username, password, enabled)
values('user','$2a$10$vVyFjZ41RxExbWPJDto60uX60RUCJWsMnwtLHDKo2SaNCZc76101u',true);

INSERT INTO users(username, password, enabled)
values('admin','$2a$10$vVyFjZ41RxExbWPJDto60uX60RUCJWsMnwtLHDKo2SaNCZc76101u',true);

INSERT INTO authorities (username, authority)
values ('user','ROLE_USER');

INSERT INTO authorities (username, authority)
values ('admin','ROLE_ADMIN');
