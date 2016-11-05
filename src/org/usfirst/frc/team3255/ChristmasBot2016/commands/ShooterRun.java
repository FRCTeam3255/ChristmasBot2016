package org.usfirst.frc.team3255.ChristmasBot2016.commands;

/**
 *
 */
public class ShooterRun extends CommandBase {

	double expireTime;
	
    public ShooterRun() {
    	requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	shooter.setAgitatorSpeed(1.0);
    	shooter.setSpeed(1.0);
    	
    	// set a timer that expires one second from now
    	expireTime = timeSinceInitialized() + 1.0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timeSinceInitialized() >= expireTime);
    }
    
    // Called once after isFinished returns true
    protected void end() {
    	shooter.setFeederSpeed(1.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
