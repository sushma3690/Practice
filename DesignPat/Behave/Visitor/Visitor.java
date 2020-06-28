package DesignPat.Behave.Visitor;

public interface Visitor {

	int visit(Pen pen);
	int visit(NotePad notePad);

}
