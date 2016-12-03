package org.usfirst.frc.team3255.ChristmasBot2016.commands;

import edu.wpi.first.wpilibj.DriverStation;

/**
 *
 */
public class CollectorReverse extends CommandBase {

    public CollectorReverse() {
    	requires(collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	collector.setSpeed(-1.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
