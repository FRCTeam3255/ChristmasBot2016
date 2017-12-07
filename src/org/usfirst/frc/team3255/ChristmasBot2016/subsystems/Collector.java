package org.usfirst.frc.team3255.ChristmasBot2016.subsystems;

import org.usfirst.frc.team3255.ChristmasBot2016.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Collector extends Subsystem {
	Talon talon = null;
	DoubleSolenoid doubleSolenoid = null;
	Relay redRelay = null;
	Relay greenRelay = null;
	
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
		talon = new Talon(RobotMap.COLLECTOR_TALON);
		doubleSolenoid = new DoubleSolenoid(RobotMap.COLLECTOR_SOLENOID_DEPLOY, RobotMap.COLLECTOR_SOLENOID_RETRACT);
		redRelay = new Relay(RobotMap.COLLECTOR_RELAY_RED);
		greenRelay = new Relay(RobotMap.COLLECTOR_RELAY_GREEN);
		
		talon.setSafetyEnabled(false);
	}

	public void setSpeed(double s) {
		talon.set(s);

	}
	
	public void deploy() {
		doubleSolenoid.set(Value.kForward);
	}

	public void retract() {
		doubleSolenoid.set(Value.kReverse);
	}

	public boolean isDeployed() {
		Value v;
		
		v = doubleSolenoid.get();

		if(v == Value.kForward) {
			return true;
		}
		
		return false;
	}
	
	public void setLED(boolean on) {
		if(on == true) {
			redRelay.set(Relay.Value.kForward);
			greenRelay.set(Relay.Value.kForward);
		}
		else {
			redRelay.set(Relay.Value.kOff);
			greenRelay.set(Relay.Value.kOff);
		}
	}
		
    public void initDefaultCommand() {
    }
}

