package com.evanschneid.RecipeMachine.jdbc;

import com.evanschneid.RecipeMachine.model.RecipeSteps;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcRecipeStepsDao implements RecipeStepsDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRecipeStepsDao(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    @Override
    public List<RecipeSteps> getAllRecipeSteps(int recipeId) {
        List<RecipeSteps> recipeSteps = new ArrayList<>();
        String sql = "SELECT recipe_step_id, recipe_id, recipe_step_number, recipe_step_desc " +
                "FROM recipe_steps " +
                "WHERE recipe_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, recipeId);
        while(results.next()) {
            recipeSteps.add(mapToRecipeSteps(results));
        }
        return recipeSteps;
    }


    private RecipeSteps mapToRecipeSteps(SqlRowSet rowSet) {
        RecipeSteps recipeSteps = new RecipeSteps();
        recipeSteps.setRecipeStepId(rowSet.getInt("recipe_step_id"));
        recipeSteps.setRecipeStepsRecipeId(rowSet.getInt("recipe_id"));
        recipeSteps.setRecipeStepNumber(rowSet.getInt("recipe_step_number"));
        recipeSteps.setRecipeStepDescription(rowSet.getString("recipe_step_desc"));
        return recipeSteps;
    }
}
