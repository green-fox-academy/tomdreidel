select
b.book_name,
a.aut_name,
c.cate_descrip,
p.pub_name,
b.book_price

from
book_mast b
join author a on b.aut_id = a.aut_id
join category c on b.cate_id = c.cate_id
join publisher p on p.pub_id = b.pub_id;
