package co.edu.uniquindio.servicios.interfaces;

import co.edu.uniquindio.dto.CompartidosDTOs.CambiarContraseniaDTO;
import co.edu.uniquindio.dto.CompartidosDTOs.DetalleCitaDTO;
import co.edu.uniquindio.dto.CompartidosDTOs.ReestablecerContraseniaDTO;
import co.edu.uniquindio.dto.CompartidosDTOs.RegistroRespuestaDTO;
import co.edu.uniquindio.modelo.enumeraciones.Eps;
import co.edu.uniquindio.modelo.enumeraciones.Especialidad;
import co.edu.uniquindio.modelo.enumeraciones.TipoSangre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicioGeneral {

    //Compartido por Administrador, Medico y Paciente
    DetalleCitaDTO verDetalleCita(int codigoCita) throws Exception;

    //Compartido por Paciente y Administrador
    int responderPQRS(RegistroRespuestaDTO dto)throws Exception;

    //Compartido por Paciente y Medico
    void cambiarPassword(CambiarContraseniaDTO dto) throws Exception;

    //Compartido por Paciente y Medico (En controlador NoAuthController)
    void enviarLinkRecuperacion(String correo) throws Exception;

    //Compartido por Administrador y Medico (En controlador NoAuthController)
    int reestablecerContrasenia(ReestablecerContraseniaDTO dto) throws Exception;

//Metodos para listar EPS, TipoSangre

    List<Eps> listarEps() throws Exception;

    List<TipoSangre> listarTiposSangre() throws Exception;

    List<Especialidad> listarEspecialidades() throws Exception;



}
