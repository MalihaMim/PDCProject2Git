/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2_gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Jennifer Nou, Student ID: 18022509
 */
public class PlayFrameTest {
    /**
     * Test of establishConnection method, of class PlayFrame.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        PlayFrame instance = new PlayFrame();
        instance.establishConnection();
    }
    /**
     * Test of getName method, of class PlayFrame.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PlayFrame instance = new PlayFrame();
        instance.setName("Test Name");
        String expResult = "Test Name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class PlayFrame.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        PlayFrame instance = new PlayFrame();
        instance.setName(name);
    }
    /**
     * Test of CreatePlayer method, of class PlayFrame.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("CreatePlayer");
        String name = "";
        PlayFrame instance = new PlayFrame();
        instance.CreatePlayer(name);
    }
    /**
     * Test of GetPlayer method, of class PlayFrame.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("GetPlayer");
        PlayFrame instance = new PlayFrame();
        Contestant expResult = null;
        Contestant result = instance.GetPlayer();
        assertEquals(expResult, result);
    }
    /**
     * Test of loadQuestionnaire method, of class PlayFrame.
     */
    @Test
    public void testLoadQuestionnaire() throws Exception {
        System.out.println("loadQuestionnaire");
        PlayFrame instance = new PlayFrame();
        Questionnaire expResult = instance.loadQuestionnaire();
        Questionnaire result = instance.loadQuestionnaire();
        assertEquals(expResult, result);
    }
    /**
     * Test of main method, of class PlayFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PlayFrame.main(args);
    }
}
