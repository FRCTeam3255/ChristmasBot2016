package org.usfirst.frc.team3255.ChristmasBot2016.commands;

import org.usfirst.frc.team3255.ChristmasBot2016.OI;
import org.usfirst.frc.team3255.ChristmasBot2016.RobotMap;


/**
 *
 */
public class DriveArcade extends CommandBase {

    public DriveArcade() {
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double moveSpeed = -OI.driverStick.getRawAxis(RobotMap.DRIVER_AXIS_MOVE_SPEED);
    	double rotateSpeed = -OI.driverStick.getRawAxis(RobotMap.DRIVER_AXIS_ROTATE_SPEED);
    	
    	drivetrain.arcadeDrive(moveSpeed, rotateSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drivetrain.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
