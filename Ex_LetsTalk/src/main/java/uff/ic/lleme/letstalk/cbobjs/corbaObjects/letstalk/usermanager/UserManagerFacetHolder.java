package uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager;

/**
 * corbaObjects/letstalk/usermanager/UserManagerFacetHolder.java . Generated by
 * the IDL-to-Java compiler (portable), version "3.2" from letstalk.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min29s BRST
 */

public final class UserManagerFacetHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager.UserManagerFacet value = null;

	public UserManagerFacetHolder() {
	}

	public UserManagerFacetHolder(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager.UserManagerFacet initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager.UserManagerFacetHelper
				.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager.UserManagerFacetHelper
				.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.usermanager.UserManagerFacetHelper.type();
	}

}