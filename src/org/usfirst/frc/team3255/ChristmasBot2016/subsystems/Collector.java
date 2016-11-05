package org.usfirst.frc.team3255.ChristmasBot2016.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Collector extends Subsystem {
	Talon talon = null;
	
	public Collector() {
		super();
    	
		init();
	}

	public Collector(String name) {
		super(name);
		
		init();
	}

	private void init() {
		// Talons
//		talon = new Talon(RobotMap.COLLECTOR_TALON);
		
//		shooterTopTalon.setSafetyEnabled(false);
//		shooterBottomTalon.setSafetyEnabled(false);
//		feederTalon.setSafetyEnabled(false);
//		agitatorTalon.setSafetyEnabled(false);
		
	}

	public void setSpeed(double s) {
//		shooterTopTalon.set(s);
//		shooterBottomTalon.set(s);
	}
	
	public void setFeederSpeed(double s) {
//		feederTalon.set(s);
	}
	
	public void setAgitatorSpeed(double s) {
//		agitatorTalon.set(s);
	}
	
	public boolean isFeederSwitchClosed(){
		return true;
	}
	
    public void initDefaultCommand() {
    }
}

