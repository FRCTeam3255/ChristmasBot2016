package org.usfirst.frc.team3255.ChristmasBot2016.commands;

/**
 *
 */
public class ShooterStop extends CommandBase {
	
	double expireTime;

    public ShooterStop() {
    	requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	shooter.setAgitatorSpeed(0);
    	shooter.setFeederSpeed(0);
    	
    	expireTime = timeSinceInitialized() + 0.2;
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
    	shooter.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
