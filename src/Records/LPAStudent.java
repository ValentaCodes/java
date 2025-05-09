package Records;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
//    The goal of the Record type is to be immutable so the only way to change these fields when creating a new
//    instance is to edit the header above or through constructors. However, that would defeat the purpose of using
//    this type.
//    If you want to modify data on your class. You wont use a Record
}
