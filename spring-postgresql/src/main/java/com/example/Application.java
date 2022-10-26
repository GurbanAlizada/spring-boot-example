package com.example;


import com.example.model.Category;
import com.example.model.Product;
import com.example.repo.CategoryRepo;
import com.example.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
@Transactional
public class Application implements CommandLineRunner {

    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    public static void main(String[] args) {

        SpringApplication.run(Application.class , args);

    }


    @Override
    @Transactional
    public void run(String... args) throws Exception {



        Category category3 = new Category("test3");
        categoryRepo.save(category3);

        Category fromDb =  categoryRepo.getById(3);
        Product product3=new Product(0,null,null,12,category3);

        productRepo.save(product3);


        /*
        Category category1 = categoryRepo.findById(1).get();
        Category category2 = new Category( "Komputer"  );
        //categoryRepo.save(category1);
       // categoryRepo.save(category2);




        Product product1 = new Product(0, "A72" , "8 RAM" , 12.2 ,category1 );
     //   Product product2 = new Product(0, "9 PRO" , "16 RAM" , 12.2 , category2);
        productRepo.save(product1);
    //    productRepo.save(product2);
*/

    }
}
