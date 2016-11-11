package org.usfirst.frc.team3255.ChristmasBot2016.commands;

/**
 *
 */
public class DoDelay extends CommandBase {
	
	double expireTime;

    public DoDelay() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
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
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}