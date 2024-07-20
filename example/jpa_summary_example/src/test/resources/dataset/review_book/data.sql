-- publisher
insert into publisher(name) values ('아침사과');
insert into publisher(name) values ('갤리온');
insert into publisher(name) values ('열린 책들');

-- book
insert into item(name, price, dtype) values('글루코스 혁명', 10000, 'Book');
insert into book(id, publisher_id) values(1, 1);

insert into item(name, price, dtype) values('생각 중독', 10000, 'Book');
insert into book(id, publisher_id) values(2, 2);

insert into item(name, price, dtype) values('퀸의 대각선 1', 10000, 'Book');
insert into book(id, publisher_id) values(3, 3);

insert into review(book_id, title, contents)
values (
    1, '혈당 스파이크 조심해야 합니다.', '너무 좋은 책이에요. 힘들다고 피곤하다고 당때려넣는게 얼마나 위험한건줄 알게되었어요'
);

insert into review(book_id, title, contents)
values (
    1, '우리 모두 통곡물 많이 먹어보아요.', '정제탄수화물 줄이고 통곡물 식품을 많이 먹어보아요'
);

insert into review(book_id, title, contents)
values (
    1, '혈당, 인슐린 저항성의 모든 원인은 정제탄수화물', '암이 생기는 가장 큰 원인은 혈당과 인슐린 저항성이라고 하지요. 우리 모두 정제 탄수화물을 줄여보아요.'
);