//package com.example.database.config;
//
//import com.example.database.model.StudentM;
//import jakarta.persistence.EntityManagerFactory;
//
//import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.autoconfigure.DataSourceProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.example.database.mysql",
//        entityManagerFactoryRef = "mysqlEntityManagerFactory",
//        transactionManagerRef = "mysqlTransactionManager"
//)
//public class MySqlConfig {
//    @Bean
//    @ConfigurationProperties("mysql.datasource")
//    public DataSourceProperties mysqlDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//    @Bean
//    public DataSource mysqlDataSource() {
//        return mysqlDataSourceProperties()
//                .initializeDataSourceBuilder()
//                .build();
//    }
//    @Bean
//    public EntityManagerFactoryBuilder entityManagerFactoryBuilder(
//            JpaVendorAdapter jpaVendorAdapter) {
//
//        return new EntityManagerFactoryBuilder(
//                jpaVendorAdapter,
//                dataSource -> new java.util.HashMap<>(),
//                null
//        );
//    }
////    @Bean
////    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(
////            EntityManagerFactoryBuilder builder) {
////        return builder
////                .dataSource(mysqlDataSource())
////                .packages(StudentM.class)
////                .persistenceUnit("mysql")
////                .build();
////    }
//    @Bean
//    public JpaTransactionManager mysqlTransactionManager(
//            @Qualifier("mysqlEntityManagerFactory")
//            EntityManagerFactory entityManagerFactory) {
//
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}