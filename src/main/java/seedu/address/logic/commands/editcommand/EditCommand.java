package seedu.address.logic.commands.editcommand;

import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
/**
 * Edit a person or a company in the address book.
 */
public abstract class EditCommand extends Command {
    public static final String COMMAND_WORD = "edit";

    public static final String MESSAGE_SUCCESS = "Success message for the edit command!";

    public static final String PERSON_INTRO = "Parameters for Person: \n"
            + "p - edit a person's contact \n"
            + "INDEX (must be a positive integer) "
            + "[" + PREFIX_NAME + "NAME] "
            + "[" + PREFIX_PHONE + "PHONE] "
            + "[" + PREFIX_EMAIL + "EMAIL] "
            + "[" + PREFIX_ADDRESS + "ADDRESS] "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " p 1 "
            + PREFIX_PHONE + "91234567 "
            + PREFIX_EMAIL + "johndoe@example.com \n";
    public static final String COMPANY_INTRO = "Parameters for Company \n"
            + "c - edit a company's contact \n"
            + "INDEX (must be a positive integer) "
            + "[" + PREFIX_NAME + "NAME] "
            + "[" + PREFIX_PHONE + "PHONE] "
            + "[" + PREFIX_EMAIL + "EMAIL] "
            + "[" + PREFIX_DESCRIPTION + "DESCRIPTION] "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " c 1 "
            + PREFIX_NAME + "Apple "
            + PREFIX_PHONE + "98765432 "
            + PREFIX_EMAIL + "johnd@example.com "
            + PREFIX_DESCRIPTION + "Top tech company"
            + PREFIX_TAG + "tech ";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits the details of the person or company identified "
            + "by the index number used in the displayed person list. "
            + "Existing values will be overwritten by the input values.\n"
            + PERSON_INTRO + COMPANY_INTRO;

    @Override
    public abstract CommandResult execute(Model model) throws CommandException;


}