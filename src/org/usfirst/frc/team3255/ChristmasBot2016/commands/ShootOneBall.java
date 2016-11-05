package org.usfirst.frc.team3255.ChristmasBot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ShootOneBall extends CommandGroup {
    
    public  ShootOneBall() {
    	addSequential(new ShooterSpinUp());
    	addSequential(new ShooterPrep());
    	addSequential(new FeederOn());
    	addSequential(new DoDelay());
    	addSequential(new FeederOff());
    	addSequential(new ShooterOff());
    }
}
