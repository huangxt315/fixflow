package com.founder.fix.fixflow.designer.modeler.ui.property.startevent;

import org.eclipse.bpmn2.StartEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class StartEventCommonPropertyFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pe) {
		EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		boolean enabled = eObject instanceof StartEvent ;
		return enabled;
	}
}