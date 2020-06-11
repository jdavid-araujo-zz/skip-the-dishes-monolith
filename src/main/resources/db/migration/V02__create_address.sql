create table tb_address (
  id bigint not null generated by default as identity
  (start with 1 increment by 1),
  country varchar(60) not null,
  city varchar(60) not null,
  postal varchar(60) not null,
  street_house varchar(120) not null,
  customer_id bigint not null,
  created_at timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
  updated_at timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,

   primary key (id),
   
   constraint fk_customer_address foreign key (customer_id) references tb_customer(id) 
);
