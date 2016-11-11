package org.usfirst.frc.team3255.ChristmasBot2016;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	// Joysticks
	public static final int JOYSTICK_DRIVER = 0;
	public static final int JOYSTICK_SHOOTER = 1;
	
	public static final int DRIVER_AXIS_LEFT_SPEED = 1;
	public static final int DRIVER_AXIS_RIGHT_SPEED = 3;
	public static final int DRIVER_AXIS_MOVE_SPEED = 1;
	public static final int DRIVER_AXIS_ROTATE_SPEED = 2;
	
	// Talons
	public static final int DRIVETRAIN_LEFT_FRONT_TALON = 0;
	public static final int DRIVETRAIN_LEFT_BACK_TALON = 1;
	public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 2;
	public static final int DRIVETRAIN_RIGHT_BACK_TALON = 3;
	
	public static final int COLLECTOR_TALON = 4;
	public static final int LIFTER_TALON = 5;
	
	public static final int SHOOTER_TOP_TALON = 6;
	public static final int SHOOTER_BOTTOM_TALON = 7;
	public static final int SHOOTER_FEEDER_TALON = 8;
	public static final int SHOOTER_AGITATOR_TALON = 9;

	// Digital I/O Ports
	public static final int SHOOTER_FEEDER_SWITCH = 0;
	
	//PCM
	public static final int COLLECTOR_SOLENOID_DEPLOY = 0;
	public static final int COLLECTOR_SOLENOID_RETRACT = 1;
	
}
