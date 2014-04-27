/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.sea.demo.demoapp.services;

import javax.ejb.Local;

/**
 *
 * @author Olivier Liechti
 */
@Local
public interface ClockServiceLocal {

	String getCurrentTime();
	
}
