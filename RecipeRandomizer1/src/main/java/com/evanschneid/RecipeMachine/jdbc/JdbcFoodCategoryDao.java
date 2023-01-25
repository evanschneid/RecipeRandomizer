package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.FoodCategory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcFoodCategoryDao implements FoodCategoryDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcFoodCategoryDao(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    // This method lists all the Food Categories from the database
    @Override
    public List<FoodCategory> getAllFoodCategories() {
        List<FoodCategory> foodCategory = new ArrayList<>();
        String sql = "SELECT food_category_id, food_category_name " +
                     "FROM food_category;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            foodCategory.add(mapToFoodCategory(results));
        }
        return foodCategory;
    }


    private FoodCategory mapToFoodCategory(SqlRowSet rowSet) {
        FoodCategory foodCategory = new FoodCategory();
        foodCategory.setFoodCategoryId(rowSet.getInt("food_category_id"));
        foodCategory.setFoodCategoryName(rowSet.getString("food_category_name"));
        return foodCategory;
    }
}
