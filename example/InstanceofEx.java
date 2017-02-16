package by.epam.l03.example;

class Course extends Object
{
}

class BaseCourse extends Course
{
}

class FreeCourse extends BaseCourse
{
}

class OptionalCourse extends Course
{
}

public class InstanceofEx
{
	public static void main(String[] args)
	{
		Course course = new FreeCourse();
		if (course instanceof BaseCourse)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if (course instanceof FreeCourse)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if (course instanceof OptionalCourse)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		doLogic(new BaseCourse());
		doLogic(new OptionalCourse());
		doLogic(new FreeCourse());
	}

	public static void doLogic(Course c)
	{
		if (c instanceof BaseCourse)
		{
			System.out.println("BaseCourse");
		}
		else if (c instanceof OptionalCourse)
		{
			System.out.println("OptionalCourse");
		}
		else
		{
			System.out.println("Что-то другое.");
		}
	}
}