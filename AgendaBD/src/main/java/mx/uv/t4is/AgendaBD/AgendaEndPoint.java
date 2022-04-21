package mx.uv.t4is.AgendaBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.agenda.AgendarEventoRequest;
import https.t4is_uv_mx.agenda.AgendarEventoResponse;
import https.t4is_uv_mx.agenda.EliminarEventoRequest;
import https.t4is_uv_mx.agenda.EliminarEventoResponse;
import https.t4is_uv_mx.agenda.EventosResponse;
import https.t4is_uv_mx.agenda.ModificarEventoRequest;
import https.t4is_uv_mx.agenda.ModificarEventoResponse;

@Endpoint
public class AgendaEndPoint {
    
    @Autowired
    Iagenda iagenda;
    
    @PayloadRoot(localPart = "AgendarEventoRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public AgendarEventoResponse evento(@RequestPayload final AgendarEventoRequest peticion) {
        AgendarEventoResponse respuesta = new AgendarEventoResponse();
        respuesta.setRNombre(peticion.getNombre());
        respuesta.setRFInicio(peticion.getFInicio());
        respuesta.setRFLimite(peticion.getFLimite());
        
        Agendax agenda = new Agendax();
        agenda.setNombre(peticion.getNombre());
        agenda.setfInicio(peticion.getFInicio());
        agenda.setfLimite(peticion.getFLimite());
        
        iagenda.save(agenda);
        return respuesta;
    }

    @PayloadRoot(localPart = "EventosRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public EventosResponse Eventos(){
        EventosResponse respuesta = new EventosResponse();
        Iterable<Agendax> lista = iagenda.findAll();
        for (Agendax agenda : lista) {
            EventosResponse.AgendaBD EventosBuscar = new EventosResponse.AgendaBD();
            EventosBuscar.setId(agenda.getId());
            EventosBuscar.setNombre(agenda.getNombre());
            EventosBuscar.setFInicio(agenda.getfInicio());
            EventosBuscar.setFLimite(agenda.getfLimite());
            respuesta.getAgendaBD().add(EventosBuscar);
        }
        return respuesta;
    }
    
    @PayloadRoot(localPart = "ModificarEventoRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public ModificarEventoResponse modificarSaludo(@RequestPayload ModificarEventoRequest peticion){
        ModificarEventoResponse respuesta = new ModificarEventoResponse();

        Agendax agenda = new Agendax();

        /*if(!eventos.isEmpty()){ 
            for (Agenda EventoModificar : eventos) { 
                if(EventoModificar.getId() == peticion.getId()){ 
                    EventoModificar.setFLimite(peticion.getNuevaFLimite()); 
                    respuesta.setId(peticion.getId()); 
                    respuesta.setFLimite(peticion.getNuevaFLimite());
                }
            }
        }*/

        agenda.setId(peticion.getId());
        agenda.setNombre(peticion.getNuevoNombre());
        agenda.setfInicio(peticion.getNuevaFInicio());
        agenda.setfLimite(peticion.getNuevaFLimite());
        iagenda.save(agenda);
        respuesta.setId(peticion.getId());
        respuesta.setNombre(peticion.getNuevoNombre());
        respuesta.setFInicio(peticion.getNuevaFInicio());
        respuesta.setFLimite(peticion.getNuevaFLimite());
        return respuesta;
    }

    @PayloadRoot(localPart = "EliminarEventoRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public EliminarEventoResponse borrarEvento(@RequestPayload EliminarEventoRequest peticion){
        //int indexDelElementoABorrar = 0;
        //boolean elementoEncontrado = false;
        EliminarEventoResponse respuesta = new EliminarEventoResponse();
        respuesta.getAgenda().clear(); 

        //Eliminar datos en la base de datos de la tabla agenda
        iagenda.deleteById(peticion.getId());

        Iterable<Agendax> lista = iagenda.findAll();
        for (Agendax agenda : lista) {
            EliminarEventoResponse.Agenda EventoEliminar = new EliminarEventoResponse.Agenda();
            EventoEliminar.setId(agenda.getId());
            EventoEliminar.setNombre(agenda.getNombre());
            EventoEliminar.setFInicio(agenda.getfInicio());
            EventoEliminar.setFLimite(agenda.getfLimite());
            respuesta.getAgenda().add(EventoEliminar);
        }

        return respuesta;

    }
}
