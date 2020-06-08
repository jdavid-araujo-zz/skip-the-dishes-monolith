create table tb_order_item (
  order_id bigint not null,
  product_id bigint not null,
  quantity_id bigint not null,
  created_at timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
  updated_at timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
   
  constraint order_item_pk primary key (order_id, product_id),
   
  constraint fk_order_item foreign key (order_id) references tb_order(id),
  constraint fk_product_item foreign key (product_id) references tb_product(id) 

);
