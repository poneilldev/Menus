/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author paul
 */
public class ScheduleTester {
    
    Schedule s = new Schedule();
    public ScheduleTester() {
    }

    @Test
    public void rotateRecipeListTest(){
        Recipe spag = new Recipe();
        spag.setTitle("Spaghetti");
        s.getRecipeList().add(spag);
        
        Recipe food1 = new Recipe();
        food1.setTitle("Spaghetti");
        s.getRecipeList().add(food1);
        
        Recipe food2 = new Recipe();
        food2.setTitle("Spaghetti");
        s.getRecipeList().add(food2);
        
        Recipe food3 = new Recipe();
        food3.setTitle("Spaghetti");
        s.getRecipeList().add(food3);
        
        Recipe food4 = new Recipe();
        food4.setTitle("Spaghetti");
        s.getRecipeList().add(food4);
        
        Recipe food5 = new Recipe();
        food5.setTitle("Spaghetti");
        s.getRecipeList().add(food5);
        
        Recipe food6 = new Recipe();
        food6.setTitle("Spaghetti");
        s.getRecipeList().add(food6);
        
        Recipe food7 = new Recipe();
        food7.setTitle("Spaghetti");
        s.getRecipeList().add(food7);
        
        for (Recipe recipe : s.getRecipeList()){
            s.getRotateList().add(recipe);
        }
        
        s.rotateRecipes();
        
        Assert.assertNotEquals(s.iterateThruSchedule(), null);
        
        
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}