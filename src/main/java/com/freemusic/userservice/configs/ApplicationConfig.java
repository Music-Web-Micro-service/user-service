package com.freemusic.userservice.configs;

//@Configuration
//@EnableWebMvc
public class ApplicationConfig {
//    @Bean(name = "sessionFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        String PACKAGE_NAME = "com.freemusic.userservice.entity";
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(PACKAGE_NAME);
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }

//    @Bean(name = "dataSource")
//    public DataSource dataSource() {
//        String RDS_ENDPOINT = "jdbc:mysql://192.168.112.3:3306";
//        String USERNAME = "root";
//        String PASSWORD = "712768";
//
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl(RDS_ENDPOINT);
//        dataSource.setUsername(USERNAME);
//        dataSource.setPassword(PASSWORD);
//
//        return dataSource;
//    }
//
//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactory.setDataSource(dataSource());
//        entityManagerFactory.setPackagesToScan("com.freemusic.userservice.entity");
//        entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        entityManagerFactory.setJpaProperties(hibernateProperties());
//        return entityManagerFactory;
//    }
//
//    private final Properties hibernateProperties() {
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect"); // or MySQL8Dialect if you are using MySQL 8
//        hibernateProperties.setProperty("hibernate.show_sql", "true");
//        return hibernateProperties;
//    }
}

