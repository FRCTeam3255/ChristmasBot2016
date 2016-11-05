package org.usfirst.frc.team3255.ChristmasBot2016.subsystems;

import org.usfirst.frc.team3255.ChristmasBot2016.RobotMap;
import org.usfirst.frc.team3255.ChristmasBot2016.commands.DriveArcade;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	Talon leftFrontTalon = null;
	Talon leftBackTalon = null;
	Talon rightFrontTalon = null;
	Talon rightBackTalon = null;
	
	RobotDrive robotDrive = null;
	
	public Drivetrain() {
		super();
    	
		init();
	}

	public Drivetrain(String name) {
		super(name);
		
		init();
	}

	private void init() {
		// Talons
		leftFrontTalon = new Talon(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
		leftBackTalon = new Talon(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
		rightFrontTalon = new Talon(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
		rightBackTalon = new Talon(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);
		
		leftFrontTalon.setSafetyEnabled(false);
		leftBackTalon.setSafetyEnabled(false);
		rightFrontTalon.setSafetyEnabled(false);
		rightBackTalon.setSafetyEnabled(false);
		
		// RobotDrive
		robotDrive = new RobotDrive(leftFrontTalon, leftBackTalon, rightFrontTalon, rightBackTalon);
		robotDrive.setSafetyEnabled(false);
	}

	public void setSpeed(double s) {
		leftFrontTalon.set(-s);
		leftBackTalon.set(-s);
		rightFrontTalon.set(s); 
		rightBackTalon.set(s);
	}
	
	public void tankDrive(double leftSpeed, double rightSpeed) {
		robotDrive.tankDrive(leftSpeed, rightSpeed);
	}

	public void arcadeDrive(double moveSpeed, double rotateSpeed) {
		robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
	}	
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveArcade());
    }
}

