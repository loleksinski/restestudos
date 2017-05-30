package com.ws.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import com.ws.rest.vo.rh.ClienteVO;

@Path("/rh")
public class ClienteService {

	@GET
	@Path("/obterClientes")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<ClienteVO> obterClientes(){
		List<ClienteVO> clientes = new ArrayList<ClienteVO>();
		String mail = "@thebestcompany.com";
				
		for (int i = 1; i <= 3; i++) {
			ClienteVO vo = new ClienteVO();
			vo.setId(i);
			vo.setNome("Nome Cliente " + i);
			vo.setEmail((vo.getNome() + mail).toLowerCase().replaceAll(" ", StringUtils.EMPTY));
			
			clientes.add(vo);
		}
		
		return clientes;
	}
	
}
