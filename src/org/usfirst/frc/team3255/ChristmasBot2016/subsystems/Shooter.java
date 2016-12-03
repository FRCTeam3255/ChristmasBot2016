package org.usfirst.frc.team3255.ChristmasBot2016.subsystems;

import org.usfirst.frc.team3255.ChristmasBot2016.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	Talon shooterTopTalon = null;
	Talon shooterBottomTalon = null;
	Talon feederTalon = null;
	Talon agitatorTalon = null;
	DigitalInput feederSwitch = null;
	
	public Shooter() {
		super();
    	
		init();
	}

	public Shooter(String name) {
		super(name);
		
		init();
	}

	private void init() {
		// Talons
		shooterTopTalon = new Talon(RobotMap.SHOOTER_TOP_TALON);
		shooterBottomTalon = new Talon(RobotMap.SHOOTER_BOTTOM_TALON);
		feederTalon = new Talon(RobotMap.SHOOTER_FEEDER_TALON);
		agitatorTalon = new Talon(RobotMap.SHOOTER_AGITATOR_TALON);
		feederSwitch = new DigitalInput(RobotMap.SHOOTER_FEEDER_SWITCH);
		
		shooterTopTalon.setSafetyEnabled(false);
		shooterBottomTalon.setSafetyEnabled(false);
		feederTalon.setSafetyEnabled(false);
		agitatorTalon.setSafetyEnabled(false);
		
	}

	public void setSpeed(double s) {
		shooterTopTalon.set(s);
		shooterBottomTalon.set(s);
	}
	
	public void setFeederSpeed(double s) {
		feederTalon.set(s);
	}
	
	public void setAgitatorSpeed(double s) {
		agitatorTalon.set(s);
	}
	
	public boolean isFeederSwitchClosed(){
		return feederSwitch.get();
	}
	
    public void initDefaultCommand() {
    }
}

