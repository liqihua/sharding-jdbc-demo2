package com.liqihua.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = ConfigConstance.DATASOURCE1_BASEPACKS, sqlSessionFactoryRef = "sqlSessionFactory1")
public class DataSourceConfig1 {

    @Value("${datasource.db1.url}")
    private String url;
    @Value("${datasource.db1.username}")
    private String username;
    @Value("${datasource.db1.password}")
    private String password;
    @Value("${datasource.db1.driverClassName}")
    private String driverClass;


    @Primary
    @Bean(name = "dataSource1")
    public DataSource dataSource1() {
        DataSource dataSource = null;
        try {
            File yamlFile = new File(DataSourceConfig1.class.getResource("/db1.yaml").getFile());
            dataSource = MasterSlaveDataSourceFactory.createDataSource(yamlFile);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Primary
    @Bean(name = "transactionManager1")
    public DataSourceTransactionManager transactionManager1() {
        return new DataSourceTransactionManager(dataSource1());
    }


    @Primary
    @Bean(name = "sqlSessionFactory1")
    public SqlSessionFactory sqlSessionFactory1(@Qualifier("dataSource1") DataSource dataSource1) throws Exception {
        final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource1);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(ConfigConstance.DATASOURCE1_MAPPER_LOACTION));
        return bean.getObject();
    }





}
