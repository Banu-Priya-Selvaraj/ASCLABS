package LAB5;

public class LearningModule {
    public String getLearningCode(String name, int age) throws WrongInputException {
        AgeValidator ageValidator = new AgeValidator();
        try {
            String ageCode = ageValidator.getAgeCode(age);
            return name + " "+ageCode;
        } catch (InvalidAgeException e) {
            throw new WrongInputException("Invalid age provided", e);
        }
    }
}

